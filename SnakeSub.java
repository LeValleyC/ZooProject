//By James Wang

public class SnakeSub extends Snake{
    public SnakeSub(){
        super("Snake Subclass", "k");
    }
    
    @Override
    public String interact(){
        return "a";
    }
    @Override
    public String walk(){
        return "aa";
    }
        public String play(){
        return "aaa";
    }
    
    
}