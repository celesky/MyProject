package com.java8.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by pan on 16/9/1.
 */
public class StreamDemo {

    public static void test() {
        List<Integer> list = Lists.newArrayList(1, 4, 5, 10, null, 5, null);
        Object[] s = (Object[]) list.stream().filter(num -> num == null).toArray();
        for (int i = 0; i < s.length; i++) {
            System.out.println("s[i] = " + s[i]);
        }
        //System.out.println("s = " + s);


    }

    public static void testInit() {
        //�������Ϊһ������12345�ļ���
//        Stream<Integer> stream = Stream.of(1,2,3,4,5);
//          Stream.of(1,2,3,4,5).forEach(System.out::println);
//        Stream<String> stream2 = Stream.of("heh","xii");
//
//        List<Integer> list = Lists.newArrayList(1,4,5,10,null,5,null);
        //һ�����޵ļ���,�����ϵ����������Ԫ��,lazy����,ֻ�е��õ���ʱ��Ż����
//        Stream.generate(()->{return Math.random();}).forEach(System.out::println);
//
//        Stream<List> stream4 = Stream.generate(new Supplier<List>() {
//            @Override
//            public List get() {
//                return list;
//            }
//        });
        //��ָ�����㷨���Ԫ�ص�����---������Ԫ�ؿ�����Ϊ�ǣ�seed��f(seed),f(f(seed))����ѭ��
        //Stream.iterate(1, item -> item + 2).limit(10).forEach(System.out::println);

//        List<Integer> nums = Lists.newArrayList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
//        System.out.println("sum is:" + nums.stream().filter(num -> num != null).
//                distinct().mapToInt(num -> num * 2).skip(2).limit(4).peek(System.out::println).sum());
        char[] contents = new char[]{'a', 'b', 'c', 'd'};
        int[] idx = {0};

        Stream.of(contents)
                .filter(e -> e != null && e.length > 0)
                .sorted((x, y) -> {
                    int t = Character.compare(x[idx[0]], y[idx[0]]);
                    idx[0] = idx[0]++;
                    return t;
                })
                .collect(Collectors.toList())
                .stream().forEach(System.out::println);
//                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
//                .toString();

    }

    public <T> T ifThenElse(boolean b, T first, T second) {
        return b ? first : second;
    }

    public static void gennerate(String[]... str) {
        Stream.of(str).forEach(System.out::println);
        //System.out.println("str = " + str);
        for (String[] s:str
             ) {
            System.out.println("s.length = " + s.length);
        }
    }

    public static void main(String[] args){
        //StreamDemo.testInit();
         String[] str1 = new String[]{"ab","cd"};
         String[] str2 = new String[]{"ef","hi","jk"};
         StreamDemo.gennerate(str1,str2);
    }

}
