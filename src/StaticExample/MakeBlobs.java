package StaticExample;


public class MakeBlobs {


    public static void main(String[] args) {
        //get inital blob count using the class itself to run the method
        System.out.println("Number of blobs"+Blob.getBlobCount());
        System.out.println("All blobs sat: "+Blob.getSaying());
        Blob b,c;
        b=new Blob("Blobby");
        //need an instance in order to run instance method
        System.out.println("This is "+b.getName());
        //how many now? - can use instance or class to find out
        System.out.println("Number of blobs now: "+b.getBlobCount());
        System.out.println(b.getName()+" says "+b.getSaying());
        c=new Blob("Charlie");
        System.out.println("Number of blobs now: "+Blob.getBlobCount());
        //Blob.getName(); cant do this
        //class also cant alter instance variables
    }
    
}
