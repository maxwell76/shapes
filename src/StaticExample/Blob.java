package StaticExample;

public class Blob {
    private String name;
    private static int blobcount=0;
    
    //instance methods can alter static variables
    public Blob(String n){
        name = n;
        blobcount++;
    }
    
    public String getName(){
        return name;
    }
    //static methods
    //should use static method to return static variable
    public static int getBlobCount(){
        return blobcount;
    }
    public static String getSaying(){
        return "We are blobs to the end!";
    }
    
}
