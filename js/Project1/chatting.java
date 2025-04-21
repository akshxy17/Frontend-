import java.util.Scanner;

public class girlFriendChatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello! I am a chatbot. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! How are you today?");
        String mood = scanner.nextLine();
        System.out.println("I'm glad to hear that you're feeling " + mood + ".");
        System.out.println("What do you like to do in your free time?");
        String hobby = scanner.nextLine();
        System.out.println("That sounds fun! I also enjoy learning new things. What is your favorite subject?");
        String subject = scanner.nextLine();
        System.out.println("That's interesting! I think " + subject + " is a great subject to learn about.");
        System.out.println("If you could travel anywhere in the world, where would you go?");
        String travel = scanner.nextLine();
        System.out.println("Wow! " + travel + " sounds like an amazing place to visit.");
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        System.out.println("Yum! I love " + food + " too.");
        System.out.println("If you could have any superpower, what would it be?");
        String superpower = scanner.nextLine();
        System.out.println("That would be so cool! " + superpower + " would definitely be a useful superpower.");
        System.out.println("Thank you for chatting with me, " + name + "! I hope you have a great day!");
        System.out.println("Is there anything else you would like to talk about? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Great! What would you like to talk about?");
            String topic = scanner.nextLine();
            System.out.println("That sounds interesting! Let's talk about " + topic + ".");
        } else {
            System.out.println("Okay! Have a wonderful day, " + name + "!");
        }
        scanner.close();

    }
}