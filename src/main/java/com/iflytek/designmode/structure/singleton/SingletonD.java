package com.iflytek.designmode.structure.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cool
 * @version V1.0
 * @className SingletonD
 * @description 推荐优雅写法
 * @createDate 2019年06月10日
 */
public class SingletonD {
    private static List<Integer> dataList = null;

    static{
        dataList = Singleton.INSTANCE.init();
    }

    private enum Singleton {
        //
        INSTANCE;
        private List<Integer> list;

        Singleton(){
            fillData();
        }
        private void fillData(){
            list = new ArrayList<Integer>(5);
            for(int i =1; i<6; i++){
                list.add(i);
            }
        }
        public List<Integer> init(){
            return list;
        }
    }

    /**
     * 公共方法
     */
    public static void doSomting(){
        System.out.println("推荐优雅写法"+dataList.get(1));
    }
}
