package com.casestudy.reservation.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class LogMessage {

    public static void startLog(String className, String methodName){
        log.info("******* "+className+" ******* "+methodName+" ******* START *******");
    }

    public static void endLog(String className, String methodName){
        log.info("******* "+className+" ******* "+methodName+" ******* END *******");
    }

    public static void errorMessage(String name, String value){
        log.error("Error Message :: Name --> " +name+" :: value: "+value);
    }

    public static void logStackTrace(Exception e){
        log.error("Error Message :: Class Name --> " +e.getClass().getSimpleName()+" :: exception: "+e);
    }

    public static void logInfoMessage(String message){
        log.info("Info Message:: Name --> "+message);
    }

    public static void logPayload(String url, String payload){
        log.info("Info Message:: \nURL --> [ "+url+" ], \npayload --> [ "+payload+" ]");
    }
}
