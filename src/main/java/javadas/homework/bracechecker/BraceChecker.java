package javadas.homework.bracechecker;

public class BraceChecker {


    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack stack = new Stack();
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop = 0;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    stack.pop();
                    if (pop == 0){
                        System.err.println("Error: Closed " + c + " bot not opend at " + i);
                    } else if(pop != '(') {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " bot opend " + (char) pop + " at: " + i);
                    }
                    break;

                case '}':
                    pop = stack.pop();
                    if (pop == 0){
                        System.err.println("Error: Closed " + c + " bot not opend at " + i);
                    }else if(pop != '{') {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " bot opend " + (char) pop + " at: " + i);
                    }
                    break;

                case ']':
                    pop = stack.pop();
                    if (pop == 0){
                        System.err.println("Error: Closed " + c + " bot not opend at " + i);
                    }else if(pop != '[') {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " bot opend " + (char) pop + " at: " + i);
                    }
                    break;
            }

        }
//        int last;
//        while ((last = stack.pop()) !=0 ){
//            isValid = false;
//            System.err.println("Error: Opend " + (char) last + " but nothig closed");
//        }

        while (stack.isEmpty()){
            isValid = false;
            System.err.println("Error: Opend " + (char) stack.pop() + " but nothig closed");
        }

        if (isValid){
            System.out.println("Everything is good!");
        }


    }
}