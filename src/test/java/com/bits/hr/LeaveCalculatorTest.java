package com.bits.hr;                                                                                                                                                                                                                              
                      
  import org.junit.Test;
  import static org.junit.Assert.*;                                                                                                                                                                                                                 
                                   
  public class LeaveCalculatorTest {                                                                                                                                                                                                                
                                    
      LeaveCalculator calc = new LeaveCalculator();
                                                                                                                                                                                                                                                    
      @Test
      public void testRemainingLeave() {                                                                                                                                                                                                            
          assertEquals(10, calc.getRemainingLeave(30, 20));
      }                                                    
       
      @Test
      public void testEncashmentAmount() {
          assertEquals(5000.0, calc.getEncashmentAmount(10, 500.0), 0.01);
      }                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                    
      @Test                                                                                                                                                                                                                                         
      public void testZeroUsedLeave() {                                                                                                                                                                                                             
          assertEquals(30, calc.getRemainingLeave(30, 0));
      }
  }             
