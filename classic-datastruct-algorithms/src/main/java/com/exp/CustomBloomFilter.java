package com.exp;

import java.util.BitSet;

/**
 *
 * @Author： bugest
 * @Description: 用于判断目标数据一定不存在或者可能存在, 即命中无法确定是否存在,不命中一定不存在
 * @Date:Created in 23:28 2021/5/2
 * @Modified By:
 */
public class CustomBloomFilter {

    private static final int DEFAULT_SIZE = 2 << 24;

    private static final int[] SEEDS = new int[]{3,13,46,71,91,134};

    private BitSet bits = new BitSet(DEFAULT_SIZE);

    private SimpleHash[] func = new SimpleHash[SEEDS.length];

    public static void main(String[] args) {
        System.out.println(2 << 24);
    }

    public CustomBloomFilter() {

        for (int i = 0; i < SEEDS.length; i++) {
            func[i] = new SimpleHash(DEFAULT_SIZE,SEEDS[i]);
        }

    }

    public void add(Object value){
        for(SimpleHash f:func){
            bits.set(f.hash(value),true);
        }
    }

    public boolean contains(Object value){
        boolean ret = true;
        for(SimpleHash f : func){
            ret = ret && bits.get(f.hash(value));
            if(!ret){
                return ret;
            }
        }
        return ret;
    }

    public static class SimpleHash{

        private int cap;
        private int seed;

        public SimpleHash(int cap,int seed){
            this.cap = cap;
            this.seed = seed;
        }

        public int hash(Object value){
            int h;
            return (value == null)? 0 :Math.abs(seed* (cap - 1) & ((h = value.hashCode())^(h>>>16)));
        }
    }
}
