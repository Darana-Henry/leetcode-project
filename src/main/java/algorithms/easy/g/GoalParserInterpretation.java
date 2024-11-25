//https://leetcode.com/problems/goal-parser-interpretation/
package algorithms.easy.g;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        GoalParserInterpretation parser = new GoalParserInterpretation();
        System.out.println("Output:\t" + parser.interpret("G()(al)"));
        System.out.println("Output:\t" + parser.interpret("G()()()()(al)"));
        System.out.println("Output:\t" + parser.interpret("(al)G(al)()()G"));
    }

    public String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }
}
