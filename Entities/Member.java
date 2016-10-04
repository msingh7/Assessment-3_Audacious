/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.Entities;

import java.util.List;
import library.interfaces.entities.EMemberState;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

public class Member implements IMember{
    String firstName, lastName, contactPhone, emailAddress;
    int id; 
    ILoan loan;
    float fine;
    List<ILoan> list;
    EMemberState memberstate;
    

    //constructor with parameter
    public Member(String firstName,String lastName,String contactPhone,String emailAddress,int id) {
    this.firstName=firstName;
    this.lastName=lastName;
    this.contactPhone=contactPhone;
    this.emailAddress=emailAddress;
    this.id=id;
    
    //exception in case of any value null
    if(firstName==null || lastName==null || contactPhone==null || emailAddress==null || id<=0){
       throw new  IllegalArgumentException ("values are null");
    }
    }
  
  //method to return member has overdue loan or not
    public boolean hasOverDueLoans() {
        if(loan.isOverDue()){
            return true;
        } else{
        return false;
        }
      }

  //method to return member hasReachedLoanLimit or not
    public boolean hasReachedLoanLimit() {
    if(loan.equals(LOAN_LIMIT)) {
        return true;
    } else{
    return false;
    }
    }

  //member to return member hasFinesPayable or not
    public boolean hasFinesPayable() {
        if(getFineAmount()>0){
            return true;
        } else {
            return false;
        }
       }


    public boolean hasReachedFineLimit() {
        if(getFineAmount()>=FINE_LIMIT){
            return true;
        }else{
            return false;
        }
      }

    //method to return fine amounts
    public float getFineAmount() {
        
        return fine;
    }

  //method toadd fine in previouys fine
    public void addFine(float amount) {
        fine=fine+amount;
        if(amount<0){
        throw new  IllegalArgumentException ("values are negative");
         }
    }
    
  //method to decrement in the fine by paying fine
    public void payFine(float payment) {
        fine=fine-payment;
          if(payment<0 || payment >fine){
        throw new  IllegalArgumentException ("PAYMENT are INVALID");
         }
        }

  //method to add the new loan in the previous loan
    public void addLoan(ILoan loan) {
        getLoans().add(loan);
        if(loan==null || hasReachedFineLimit()){
       throw new  IllegalArgumentException ("loan disallowed");
    }
    }

    public List<ILoan> getLoans() {
      return list;
     
    }

    //method to remove the loan from list list of loan
    public void removeLoan(ILoan loan) {
        list.remove(loan);
        if(loan==null || !(list.contains(loan))){
        throw new  IllegalArgumentException ("no loan contain");
            }
    }
    
    //gettter or accessor method to return the values
    public EMemberState getState() {
    return memberstate;   
    }

    public String getFirstName() {
      return firstName;
    }

    public String getLastName() {
     return lastName;
    }

    public String getContactPhone() {
     return contactPhone;
    }

    public String getEmailAddress() {
    return emailAddress;
    }

    public int getID() {
     return id;
    }
    
}
