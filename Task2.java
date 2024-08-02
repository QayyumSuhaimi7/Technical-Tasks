public class Task2 {
    public static void main(String[] args) {

        System.out.println("\nExample 1");
        checkTrashSymbol("a@b!!b$a", "!@$");

        System.out.println();

        System.out.println("Example 2");
        checkTrashSymbol("?Aa#c", "#?");

        System.out.println();

        System.out.println("Example 3");
        checkTrashSymbol("102!01", "!");
        System.out.println();

    }

    public static void checkTrashSymbol(String InputString, String TrashSymbolsString) {

        InputString = InputString.toLowerCase();

        boolean result = true;
        int j = InputString.length() - 1;

        for (int i = 0; i <= j; i++) {

            i = checkTrashSymbol(InputString, i, TrashSymbolsString, "Left");

            j = checkTrashSymbol(InputString, j, TrashSymbolsString, "Right");

            if (i < j && InputString.charAt(i) != (InputString.charAt(j))) {
                result = false;
                //System.out.println(InputString.charAt(i));
            }

            j--;
        }

        System.out.println("InputString: " + InputString);
        System.out.println("TrashSymbolsString: " + TrashSymbolsString);
        System.out.println("Result should be: " + result);

    }

    public static int checkTrashSymbol(String InputString, int index, String TrashSymbolsString, String Side) {

        if(Side.equals("Left")) {
            while (index < InputString.length() && TrashSymbolsString.contains(Character.toString(InputString.charAt(index)))){
                //System.out.println(InputString.charAt(index));
                index++;
            }
        } else {
            while (index < InputString.length() && TrashSymbolsString.contains(Character.toString(InputString.charAt(index)))){
                //System.out.println(InputString.charAt(index));
                index--;
            }
        }

        return index;

    }

}

