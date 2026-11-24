package com.bits.hr;
                                                                                                                                                                                                                                                    
  public class LeaveCalculator {
                                
      public int getRemainingLeave(int totalLeave, int usedLeave) {
          return totalLeave - usedLeave;                           
      }                                 
                                                                                                                                                                                                                                                    
      public double getEncashmentAmount(int remainingLeave, double dailySalary) {
          return remainingLeave * dailySalary;                                                                                                                                                                                                      
      }                                       
  } 
