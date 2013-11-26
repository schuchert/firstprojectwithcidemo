package shoe.example.firstproject;


public class ShuntingYardAlgorithm {
    public String translate(String infixExpression) {
        String result = infixExpression != null ? infixExpression : "";
        if(!result.matches("\\d*"))
            throw new IllegalArgumentException("Badly formed expression");
        return result;
    }
}
