import java.util.HashMap;
import java.util.Map;

public class TextDocument {
    public static void main(String[] args) {
        String wrd ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. Diam volutpat commodo sed egestas egestas fringilla phasellus " +
                "faucibus scelerisque. Egestas purus viverra accumsan in nisl. Consequat mauris nunc congue " +
                "nisi. Nullam eget felis eget nunc lobortis mattis aliquam faucibus. Pretium nibh ipsum consequat nisl. " +
                "Amet cursus sit amet dictum sit amet justo donec enim. Venenatis urna cursus eget nunc scelerisque" +
                " viverra mauris. Id venenatis a condimentum vitae. Suspendisse sed nisi lacus sed viverra. " +
                "Nibh cras pulvinar mattis nunc sed blandit libero. At augue eget arcu dictum.";

        System.out.println(countWord(wrd));
    }
    public static Map countWord(String word){
        Map<Integer, String> mapList = new HashMap<>();
        String [] str;
        str = word.split(" ");
        for (int i = 0; i < str.length; i++) {
            mapList.put(i,str[i]);
            
        }
       return mapList;

    }
}
