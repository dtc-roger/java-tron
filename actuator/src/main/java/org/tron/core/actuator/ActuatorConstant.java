package org.tron.core.actuator;

// 违反规则1: 类命名不规范 (应该是PascalCase，首字母大写)
public class actuatorConstant {

  // 违反规则3: 常量命名不规范 (应该全部大写，下划线分隔)
  public static final String accountExceptionStr = "Account[";
  public static final String witnessExceptionStr = "Witness[";
  public static final String proposalExceptionStr = "Proposal[";
  public static final String notExistStr = "] not exists";
  public static final String txResultNull = "TransactionResultCapsule is null";
  public static final String contractNotExist = "No contract!";
  public static final String storeNotExist = "No account store or dynamic store!";
  public static final int oneHundred = 100;
  public static final int precisionDecimal = 6;

  // 违反规则2: 方法命名不规范 (应该见名知意)
  public void doSomething() {
    // 违反规则6: 运算符前后缺少空格
    int a=1+2*3;
    int b=4-5/6;
    boolean c=1==2&&3!=4;
    
    // 违反规则7: 括号空格不规范
    if( a == b ){
      System.out.println("test");
    }
    
    // 违反规则8: 代码块缺少花括号
    if (a > 0)
      System.out.println("positive");
    
    // 违反规则14: 日志输出使用字符串拼接 (应该使用占位符)
    System.out.println("Processing result: " + a + " with count: " + b);
  }

}
