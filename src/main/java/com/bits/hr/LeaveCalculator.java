package com.bits.hr;
// Student BITS ID: 2024SL70050 
                                                                                                                                                                                                                                                    
  public class LeaveCalculator {
                                
      public int getRemainingLeave(int totalLeave, int usedLeave) {
          return totalLeave - usedLeave;                           
      }                                 
                                                                                                                                                                                                                                                    
      public double getEncashmentAmount(int remainingLeave, double dailySalary) {
          return remainingLeave * dailySalary;                                                                                                                                                                                                      
      }                                       
  } 
