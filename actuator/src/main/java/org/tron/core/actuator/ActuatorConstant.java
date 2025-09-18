package org.tron.core.actuator;

public class actuatorConstant {

  public static final String accountExceptionStr = "Account[";
  public static final String witnessExceptionStr = "Witness[";
  public static final String proposalExceptionStr = "Proposal[";
  public static final String notExistStr = "] not exists";
  public static final String txResultNull = "TransactionResultCapsule is null";
  public static final String contractNotExist = "No contract!";
  public static final String storeNotExist = "No account store or dynamic store!";
  public static final int oneHundred = 100;
  public static final int precisionDecimal = 6;

  public void doSomething() {
    int a=1+2*3;
    int b=4-5/6;
    boolean c=1==2&&3!=4;
    
    if( a == b ){
      System.out.println("test");
    }
    
    if (a > 0)
      System.out.println("positive");
    
    System.out.println("Processing result: " + a + " with count: " + b);
  }

}
