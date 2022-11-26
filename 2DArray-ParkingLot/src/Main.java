import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args){
        Boolean space = true;
        int nOfArrays = 0;
        int nOfElements = 0;
        String nOfElementsString = null;
        String nOfArraysString = null;
        int index = 0;
        int index2 = 0;
        String numbers = "0123456789";
        for(String otherThanNum = "Y"; !otherThanNum.equals("N");){
            try{
                do{
                    nOfArrays = Integer.parseInt(JOptionPane.showInputDialog("How many arrays will the 2D array have? "));
                    nOfArraysString = Integer.toString(nOfArrays);
                }while(nOfArraysString.charAt(0) == '-');
                for(int i = 0; i < numbers.length(); i++){
                    if(nOfArraysString.charAt(index) == numbers.charAt(i)){
                        if(nOfArraysString.charAt(index) == '0'){
                            index--;
                            break;
                        }
                        otherThanNum = "N";
                        break;
                    }
                }
                index++;
            }catch (NumberFormatException e) {

            }
        }
        for(String otherThanNum = "Y"; !otherThanNum.equals("N");){
            try{
                do{
                    nOfElements = Integer.parseInt(JOptionPane.showInputDialog("How many elements will each array have? "));
                    nOfElementsString = Integer.toString(nOfElements);
                }while(nOfElementsString.charAt(0) == '-');
                for(int i = 0; i < numbers.length(); i++){
                    if(nOfElementsString.charAt(index2) == numbers.charAt(i)){
                        if(nOfElementsString.charAt(index2) == '0'){
                            index2--;
                            break;
                        }
                        otherThanNum = "N";
                        break;
                    }
                }
                index2++;
            }catch(NumberFormatException e){

            }
        }
        String cars[][] = new String[nOfArrays][nOfElements];
        JOptionPane.showMessageDialog(null, "Now, let's park some cars inside the 2D Array.");
        for(int i = 0; i < nOfArrays; i++){
            System.out.println("Parking Section N° " + i);
            System.out.println();
            for(int j = 0; j < nOfElements; j++){
                do{
                    try{
                        do{
                            cars[i][j] = JOptionPane.showInputDialog("What car is it you wanna park into my 2D Array?");
                            try{
                                if (cars[i][j].charAt(0) != ' ') {
                                    space = false;
                                }
                            }catch(NullPointerException e){
                                cars[i][j] = "";
                            }
                        }while(cars[i][j].charAt(0) == ' ');
                    }catch(StringIndexOutOfBoundsException e){

                    }
                }while(space);
                space = false;
                if(cars[i][j] == null){
                    for(String isNull = "Y"; !isNull.equals("N");){
                        do{
                            try{
                                do{
                                    cars[i][j] = JOptionPane.showInputDialog("What car is it you wanna park into my 2D Array?");
                                    if(cars[i][j].charAt(0) != ' '){
                                        space = false;
                                    }
                                } while (cars[i][j].charAt(0) == ' ');
                            }catch(StringIndexOutOfBoundsException e){

                            }
                        }while(space);
                        space = false;
                        try{
                            if (!cars[i][j].equals("")) {
                                System.out.print("Parking lot N° " + j + " is occupied by: " + cars[i][j] + "\t");
                                isNull = "N";
                            }
                        }catch(NullPointerException e){

                        }
                    }
                }else if(!cars[i][j].equals("")){
                    System.out.print("Parking lot N° " + j + " is occupied by: " + cars[i][j] + "\t");
                }
                if(cars[i][j].equals("")){
                    for(String emptyParkingLot = "Y"; !emptyParkingLot.equals("N");){
                        do{
                            try{
                                do{
                                    cars[i][j] = JOptionPane.showInputDialog("What car is it you wanna park into my 2D Array?");
                                    try {
                                        if (cars[i][j].charAt(0) != ' ') {
                                            space = false;
                                        }
                                    }catch(NullPointerException e){
                                        cars[i][j] = "";
                                    }
                                } while (cars[i][j].charAt(0) == ' ');
                            }catch(StringIndexOutOfBoundsException e){

                            }
                        }while(space);
                        space = false;
                        if(!cars[i][j].equals("")){
                            emptyParkingLot = "N";
                            System.out.print("Parking lot N° " + j + " is occupied by: " + cars[i][j] + "\t");
                        }
                    }
                }
            }
            System.out.println();
            System.out.println();
        }
        JOptionPane.showMessageDialog(null, "Thanks for using my services, all of your cars were successfully parked into my 2D Array!");
    }
}