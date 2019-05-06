package com.shengzhiyi.tea.controller;

public class TeaDataResult {
/*
    */
/**
     * 结果封装
     *
     * @author zhangnan
     * @version 1.0
     * @since JDK 1.8
     *//*

    public class ContractDataResult {
        private static final long serialVersionUID = 1L;


        */
/**
         * 失败
         *//*

        public static final int FAIL    = 0;
        */
/**
         * 成功
         *//*

        public static final int SUCCESS = 1;

        */
/**
         * 布尔成功
         *
         * @return 布尔成功
         *
         * @author zhangnan 2018年09月03日15:37:57
         *//*

        public static DataResult<Boolean> booleanSuccess() {
            return DataResult.success(Boolean.TRUE, Boolean.class);
        }

        public static DataResult<Boolean> booleanFail() {
            return DataResult.success(Boolean.FALSE, Boolean.class);
        }

        public static DataResult<Boolean> booleanBase(Boolean flag) {
            if (flag == true) {
                return  booleanSuccess();
            } else {
                return booleanFail();
            }
        }

        public static <T> DataResult<T> objSuccess(T obj) {
            DataResult<T> dataResult = new DataResult<>();
            dataResult.setResult(obj);
            return dataResult;
        }
*/

    }
