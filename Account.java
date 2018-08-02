import java.util.Scanner;
public class Account{

private int balance;
private String password;
private String username;
private int amount; 
private int menu;

Person person = new Person();
Scanner scanner = new Scanner(System.in);
String [] arr = new String[5];

Account(){
    

}

Account(String password, String username, int balance, int amount, int menu){

this.username = username;
this. password = password;
this.balance = balance;
this.amount = amount;
this.menu = menu;
}


public void setMenu(int menu){

    this.menu = menu;
}

public int getMenu(){

    return this.menu;
}


public void setPassword(String password){

this.password = password;

} 

public String getPassword(){

    return this.password;
}

public void setUsername(String username){

    this.username = username;
}

public String getUserName(){

return this.username;

}

public void setBalance(int balance){
    this.balance =balance;

}

public int getBalance(){

    return this.balance;
}

public void setAmount(int amount){

this.amount = amount;

}

public int getAmount(){

return this.amount;

}


public void createpassword(Person person){

password = person.getName() + person.getLastName() + "1234";
System.out.println(person.getName() + person.getLastName() + "1234");
arr[0] = password;




}

public void createUserName(Person person){

username = person.getAge() + person.getLastName() + "@Atm";
System.out.println(person.getAge() + person.getLastName() + "@Atm"); 
arr[1] = username;

}

public void displayBalance(){

System.out.println("\t \t \t  \t \t \t                YOUR BALANCE IS : " + balance);
System.out.println(" \t \t \t  \t \t \t  ===============================================||");
menu();
}

public void widthdraw(){

System.out.println("(\t \t \t  \t \t \t              HOW MUCH WOULD YOU LIKE TO WIDTHDRAW");
System.out.println("\t \t \t  \t \t \t \t ============================================||");
    int amt = scanner.nextInt();
    balance= balance - amt;
    
    System.out.println("(\t \t \t  \t \t \t \t           YOUR BALANCE IS: " + balance);
    System.out.println("\t \t \t  \t \t \t \t   ===========================================||");
    menu();
}

public void deposit(){

System.out.println("\t \t \t  \t \t \t        HOW MUCH WOULD YOU LIKE TO DEPOSIT");   
System.out.println(" \t \t \t  \t \t \t ==============================================||"); 
int amount = scanner.nextInt();
balance = balance + amount;

System.out.println("\t \t \t  \t \t \t \t             YOUR BALANCE IS: "  + "R "  + balance);
System.out.println(" \t \t \t  \t \t \t \t   ========================================||");
menu();

}

public int menu()
{
    int menuChoice;
    
    do
    { 
        System.out.print("\nPlease Choose From the Following Options:"
                + "\n 1. Create an account" + 
                  "\n 2. Login" +
                  "\n 3. Display Balance"  +
                  "\n 4. Deposit" + 
                  "\n 5. Withdraw" + 
                  "\n 6. Log Out\n\n");

        menuChoice = scanner.nextInt();

        if (menuChoice < 1 || menuChoice > 6){
            System.out.println("error");
        }

    }while (menuChoice < 1 || menuChoice > 7);

    if(menuChoice == 1){
    create();
    }

    else if(menuChoice == 2 ){
    login();

    }
    else if(menuChoice == 3){
    displayBalance();  
    }

    else if(menuChoice == 4){
    deposit();
    }
    else if(menuChoice == 5){
    widthdraw();
    }
    else if(menuChoice == 6){
        System.out.println("========================================||");
        System.out.println("THANK YOU, HAVE A NICE DAY!");
        System.out.println("========================================||");
        System.exit(0);
} 


    return menuChoice;

   
}


















///////////////////////////////////



public void create(){

    Scanner scanner = new Scanner(System.in);
    Account account = new Account();
    Person person = new Person();
    String [] arr = new String[2];
    
    
    System.out.println("\t \t  \t \t \t \t  \t   WELCOME TO THE TABE ATM");
    System.out.println(" \t  \t \t \t  \t \t =============================================||");
    System.out.println("\t \t  \t \t \t  \t \t PLEASE CREATE AN ACCOUNT");
    System.out.println("\t  \t \t \t  \t \t =============================================||");
    
    System.out.println(" \t \t \t  \t \t  \t \t  PLEASE ENTER YOUR NAME");
    String name = scanner.nextLine();
    person.setName(name); 
    System.out.println(" \t \t \t  \t \t \t ===============================================||");
    
    System.out.println(" \t \t \t  \t \t \t  \t PLEASE ENTER YOUR LAST NAME");
    String lastName = scanner.nextLine();
    person.setLastName(lastName);
    System.out.println(" \t \t \t  \t \t \t  ===============================================||");
    
    System.out.println(" \t \t \t  \t \t \t \t   PLEASE ENTER YOUR AGE");
    int age = scanner.nextInt();
    person.setAge(age);
    System.out.println(" \t \t \t  \t \t \t  ===============================================||");
    
    System.out.println(" \t \t \t  \t \t THIS IS YOUR NEW PASSWORD, PLEASE KEEP IT SAFE, TO PREVENT FRAUDULENT ACTIVITY");
    System.out.println(" \t \t \t  \t \t ================================================================================||");
    account.createpassword(person);
    arr[0] = password; 
    
    
    System.out.println("\t \t \t  \t \t ********************************************************************************||");
    System.out.println(" \t \t \t  \t \t THIS IS YOUR NEW USERNAME, PLEASE KEEP IT SAFE, TO PREVENT FRAUDULENT ACTIVITY");
    account.createUserName(person);
    arr[1] = username;
    System.out.println(" \t \t \t  \t \t ********************************************************************************||");
    
    menu();
    
    }


    ////////////////////////////////////////////

    public void login(){


        
     for(int a=0; a<1; a++){
        
            
        System.out.println("\t \t \t  \t \t \t \t  \t      PLEASE ENTER YOUR USERNAME");
        System.out.println(" \t \t \t  \t \t ================================================================================||");
        String use = scanner.nextLine();
        
        
        
        System.out.println("\t \t \t \t  \t \t \t \t      PLEASE ENTER YOUR PASSWORD");
        System.out.println(" \t \t \t  \t \t ================================================================================||");
        String pass =scanner.nextLine();
        


        if(use.equalsIgnoreCase(arr[1])) {
        
            System.out.println("\t \t \t \t \t  \t \t \t \t  USERNAME CORRECT!");
            System.out.println("\t \t \t \t \t  \t \t \t \t ===================||");
            
        }
        
        else{
        
            System.out.println("\t \t \t \t \t  \t \t \t \t USERNAME INCORRECT, PLEASE TRY AGAIN!");
            System.out.println("\t \t \t \t \t  \t \t \t \t  ========================================||");
        }
        
        if(pass.equalsIgnoreCase(arr[0])){
        
            System.out.println("\t \t \t \t \t  \t \t \t \t  PASSWORD CORRECT!");
            System.out.println("\t \t \t \t \t  \t \t \t \t ===================||");
            
        }
        
        else{
        
            System.out.println("\t \t \t \t  \t \t \t \t  Password INCORRECT, PLEASE TRY AGAIN!");
            System.out.println("\t \t \t \t \t  \t \t \t \t  ====================================||");
        }
        if(pass.equalsIgnoreCase(arr[0]) && use.equalsIgnoreCase(arr[1])){
            a=99;
        }
        else{
            a=-1;
        }
        }
        
        menu();
            }
        





    
}