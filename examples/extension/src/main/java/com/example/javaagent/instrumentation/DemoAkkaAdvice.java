package com.example.javaagent.instrumentation;

import net.bytebuddy.asm.Advice;

public class DemoAkkaAdvice {

  @Advice.OnMethodEnter
  public static void onEnter() throws InterruptedException {
    System.out.println("Bytebuddy: Lukasz was here!");
  }
}