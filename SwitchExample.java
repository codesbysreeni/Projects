public class SwitchExample {
    
    public static void main(String[] args) {

        String today = "Monday";
        String tomorrow = "Tuesday";
        String weekend = "Saturday";
        
        System.out.println("=== Traditional Switch Statement ===");
        traditionalSwitch(today);
        
        System.out.println("\n=== Enhanced Switch Expression (Arrow Syntax) ===");
        String result = enhancedSwitchExpression(tomorrow);
        System.out.println("Result: " + result);
        
        System.out.println("\n=== Enhanced Switch with Code Blocks ===");
        String detailed = enhancedSwitchWithBlocks(weekend);
        System.out.println("Detailed result: " + detailed);
        
        System.out.println("\n=== Pattern Matching in Switch (Java 17+) ===");
        patternMatchingDemo("Hello");
        patternMatchingDemo(42);
        patternMatchingDemo(3.14);
    }
    
    public static void traditionalSwitch(String day) {
        switch (day) {
            case "Monday":
                System.out.println("Monday blues");
                break;
            case "Tuesday":
                System.out.println("Taco Tuesday");
                break;
            case "Wednesday":
                System.out.println("Halfway through");
                break;
            case "Thursday":
                System.out.println("Almost there");
                break;
            case "Friday":
                System.out.println("TGIF!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend vibes");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
    
    public static String enhancedSwitchExpression(String day) {
        return switch (day) {
            case "Monday" -> "Monday blues";
            case "Tuesday" -> "Taco Tuesday";
            case "Wednesday" -> "Halfway through";
            case "Thursday" -> "Almost there";
            case "Friday" -> "TGIF!";
            case "Saturday", "Sunday" -> "Weekend vibes";
            default -> "Invalid day";
        };
    }
    
    public static String enhancedSwitchWithBlocks(String day) {
        return switch (day) {
            case "Monday" -> {
                System.out.println("Processing Monday...");
                yield "Monday blues";
            }
            case "Tuesday" -> {
                System.out.println("Processing Tuesday...");
                yield "Taco Tuesday";
            }
            case "Wednesday" -> {
                System.out.println("Processing Wednesday...");
                yield "Halfway through";
            }
            case "Thursday" -> {
                System.out.println("Processing Thursday...");
                yield "Almost there";
            }
            case "Friday" -> {
                System.out.println("Processing Friday...");
                yield "TGIF!";
            }
            case "Saturday", "Sunday" -> {
                System.out.println("Processing weekend day...");
                yield "Weekend vibes";
            }
            default -> {
                System.out.println("Processing unknown day...");
                yield "Invalid day";
            }
        };
    }
    
    public static void patternMatchingDemo(Object obj) {
        String description = switch (obj) {
            case String s -> "String with length: " + s.length();
            case Integer i -> "Integer with value: " + i;
            case Double d -> "Double with value: " + d;
            case null -> "It's null";
            default -> "Unknown type: " + obj.getClass().getName();
        };
        
        System.out.println(description);
    }
}