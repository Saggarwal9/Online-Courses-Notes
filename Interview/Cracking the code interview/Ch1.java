
public class Ch1 {
    
    static int[][] arr= {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {0,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
    };

    //1
    //Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    //cannot use additional data structures?
    //If we cannot use additional data structures, we can either sort the string and take O(nlogn) time
    //or do linear compare which will take O(n^2) time but overall, O(1) space
    public static boolean isUnique(char[] arr) {
        if(arr.length>128)
            return false;
        int[] count=new int[128];
        for(int i=0;i<arr.length;i++) {
            if(count[(int)arr[i]]>0) {
                return false;
            }
            else {
                count[(int)arr[i]]++;
            }
        }
        return true;
    }

    //2
    //Check Permutation: Given two strings, write a method to decide if one is a permutation of the
    //other.
    //Two approaches: Can sort and do an equal check, if we can modify the string.
    //Second approach programmed.
    public static boolean checkPermutation(char[] str1,char[] str2) {
        if(str1.length!=str2.length)
            return false;
        int[] count=new int[128];

        for(int i=0;i<str1.length;i++) {
            count[(int)str1[i]]++;
        }

        for(int i=0;i<str2.length;i++) {
            count[(int)str2[i]]--;
            if(count[(int)str2[i]]<0)
                return false;
        }

        return true;
    }

    //3
    /*
     * Write a method to replace all spaces in a string with '%20: You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given the "true"
    length of the string. (Note: If implementing in Java, please use a character array so that you can
    perform this operation in place.)
     */
    public static char[] URLify(char[] str,int length) {
        char[] url=new char[length*2];
        int numspaces=0;
        for(int i=0;i<length;i++) {
            if(str[i]==' ')
                numspaces++;
        }

        int index=length +(numspaces*2)-1;
        for(int i=length-1;i>=0;i--) {
            if(str[i]==' ') {
                url[index]='0';
                url[index-1]='2';
                url[index-2]='%';
                index-=3;
            }
            else {
                url[index]=str[i];
                index--;
            }
        }
        return url;
    }

    //4
    /*
    Given a string, write a function to check if it is a permutation of a palindrome.
    A palindrome is a word or phrase that is the same forwards and backwards. A permutation
    is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
    EXAMPLE
    Input: Tact Coa
    Output: True (permutations: "taco cat". "atco cta". etc.)
     */
    //->Non character shouldn't get mapped<-
    public static boolean palintation(String string) { //11/10 word-play
        char[] arr=new char[(int)'z'-(int)'a' +1];
        char[] str=string.toLowerCase().toCharArray();
        int oddCount=0;
        int length=0;
        for(int i=0;i<str.length;i++) {//O(n)
            if(str[i]>=(int)'a' && str[i]<=(int)'z') {
                arr[(int)str[i]-(int)'a']++;
                length++;
            }
        }
        int isEven=length%2==0?1:0;
        for(int i=0;i<str.length;i++) { //O(n)
            if(arr[i]%2!=0)
                oddCount++;
            if(oddCount>1)
                return false;
            if(isEven==1 && oddCount!=0)
                return false;
        }

        return true;
    }

    //5
    /*
     * There are three types of edits that can be performed on strings: insert a character,
    remove a character, or replace a character. Given two strings, write a function to check if they are
    one edit (or zero edits) away.
    EXAMPLE
    pale, pIe -> true
    pales. pale -> true
    pale. bale -> true
    pale. bake -> false
     */
    public static boolean oneAway(String arr1,String arr2) {
        if(Math.abs(arr1.length()-arr2.length()) >= 2)
            return false;
        char[] s1=arr1.length()>arr2.length()?arr1.toCharArray():arr2.toCharArray();//larger string
        char[] s2=arr1.length()>arr2.length()?arr2.toCharArray():arr1.toCharArray();
        int i=0;//larger string pointer
        int j=0;//shorter string pointer
        int edits=0;
        while(i<s1.length && j<s2.length) {
            if(s1[i]!=s2[j]) {
                if(edits>=1) {
                    return false;
                }
                edits++;
                if(s1.length==s2.length) {
                    j++;
                }
            }
            else {
                j++;
            }
            i++;
        }

        return true;
    }

    //6
    /*
     * Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
    "compressed" string would not become smaller than the original string, your method should return
    the original string. You can assume the string has only uppercase and lowercase letters (a - z).
     */
    public static String compress(String string) {
        StringBuilder comp=new StringBuilder();
        //Calculate compressed string length
        for(int i=0;i<string.length();i++) {
            int count=1;
            while(i<string.length()-1 && string.charAt(i)==string.charAt(i+1)) {
                count++;
                i++;
            }
            comp.append("" +string.charAt(i)+count);
            if(string.length()<comp.length())
                return string;
        }
        //
        return comp.toString();
    }

    
    //////////////////////////////////////////////////////////////
    //Arrays
    /////////////////////////////////////////////////////////////
    
    static void printArray(int[][] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //7
    /* GOOD QUESTION--
     * Given an image represented by an NxN matrix, where each pixel in the image is 4
       bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
     */
    public static boolean rotateMatrix(int[][] pixels){
        if(pixels.length==0 || pixels.length!=pixels[0].length)
            return false;
        for(int y=0;y<pixels.length/2;y++) {
            for(int x=y;x<pixels.length-y-1;x++) {
                int temp=pixels[y][x]; //Top group
                pixels[y][x]=pixels[pixels.length-x-1][y]; //Left side to top side
                pixels[pixels.length-x-1][y]=pixels[pixels.length-y-1][pixels.length-x-1]; //Bottom side to left side
                pixels[pixels.length-y-1][pixels.length-x-1]=pixels[x][pixels.length-y-1];//Right side to bottom side
                pixels[x][pixels.length-y-1]=temp; //Top to right side

            }
        }
        return true;
    }

    //8
    /*
     * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
       column are set to O.
     */
    public static void zeroMatrix(int[][] matrix) {
        boolean rowZero=false;
        boolean colZero=false;
        
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(i==0 && matrix[i][j]==0)
                    rowZero=true;
                if(j==0 && matrix[i][j]==0)
                    colZero=true;
                if(matrix[i][j]==0) {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++) {
            for(int j=1;j<matrix[i].length;j++) {
                if(matrix[i][0]==0 || matrix[0][j] ==0)
                    matrix[i][j]=0;
            }
        }
        
        if(rowZero) {
            for(int i=0;i<matrix.length;i++) {
                matrix[0][i]=0;
            }
        }
        
        if(colZero) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[j][0]=0;
            }
        }
        
        printArray(matrix);
    }
    
 
    
    public static void main(String args[]) {
        System.out.println(isUnique("mynameis".toCharArray()));
        System.out.println(checkPermutation("hello".toCharArray(),"hey".toCharArray()));
        System.out.println(URLify("Mr John Smith     ".toCharArray(),13));
        System.out.println((int)'A'-(int)'a');
        System.out.println(palintation("atco cta"));
        System.out.println(oneAway("pales","bale"));
        System.out.println(compress("aaaabc"));
        rotateMatrix(arr);
        zeroMatrix(arr);
    }

}
