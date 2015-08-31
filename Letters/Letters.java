
/**
 * Letters to Mom, Friend, and Dog
 * 
 * Hannah Hersey and Brandon Li 
 * 8/27/15
 */
public class Letters
{
    public static void main(String[] args) {
        dear();
        System.out.println(" Mom,");
        paragraph();
        System.out.println();
        momP();
        System.out.println();
        love();
        System.out.println();
        dear();
        System.out.println(" Friend,");
        paragraph();
        System.out.println();
        friendP();
        System.out.println();
        love();
        System.out.println();
        dear();
        System.out.println(" Dog,");
        bark();
        bark();
        seeBelow();
        System.out.println();
        paragraph();
        System.out.println();
        bark();
        seeBelow();
        System.out.println();
        dogP();
        System.out.println();
        love();
    }
    
    public static void dear() {
        System.out.print("dear");
    }
    
    public static void paragraph() {
        howAreYou();
        Weather();
        Health();
        Space();
    }
    
    public static void love() {
        System.out.println("love,");
        System.out.println("\t Johnny Appleseed");
    }
    
    public static void howAreYou() {
        System.out.println("Hello! Long time no see! How are you doing? I am having fun with my");
        System.out.println("friends at the International Space Station, but I thought I should");
        System.out.println("write a letter about how I am doing and say hi! It is very fun here!");
    }
    
    public static void Weather() {
        System.out.println("By the way, how is the weather in Millbrae? In space, we see that");
        System.out.println("there are many clouds above the Bay Area. I hope it is raining so");
        System.out.println("the drought can be fixed! I miss seeing the big bright blue sky!!!");
    }
    
    public static void Health() {
        System.out.println("While living in space is fun, it can get a little tiring since we can");
        System.out.println("only float. That is why I have to constantly exercise to make sure");
        System.out.println("that my bones don't deteriate. Don't worry though! It's not that bad");
    }
    
    public static void Space() {
        System.out.println("Space is cool, but I wish I could go back to Earth!");
    }
    
    public static void momP() {
        System.out.println("Oh! And Mom, the next time you send a package from Earth, do you think");
        System.out.println("you can bring me some chocolate? That would be nice. Thanks!");
    }
    
    public static void friendP() {
        System.out.println("Friend, don't forget to remind me when I come home that I owe you $10");
        System.out.println("from when we went out to eat! I still need to pay you back!");
    }
    
    public static void bark() {
        linesOfBark();
        linesOfBark();
        linesOfBark();
    }
    
    public static void linesOfBark() {
        System.out.println("Bark! Bark! Bark! Bark! Bark! Bark! Bark! Bark! Bark! Bark! Bark! Bark!");
    }
    
    public static void seeBelow() {
        System.out.println("\t Translation below");
    }
    
    public static void dogP() {
        System.out.println("When I come home, where should we go on a walk? I was thinking we can");
        System.out.println("go to the park, and then go uphill to the trail. Can't wait!");
    }
}
