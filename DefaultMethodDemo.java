interface MyIF { 
int getUserID();

default int getAdminID() { 
return 1;
}
}

class myIFImp implements MyIF { 
int getUser() { 
return 100;
}
}

class DefaultMethodDemo { 
public static void main(String args[]) { 

myIFImp obj = new myIFImp();

System.out.println("User ID is " + obj.getUserID());

System.out.println("Administrator ID is " + obj.getAdminID());
}}