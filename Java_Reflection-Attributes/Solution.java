public class Solution {

        public static void main(String[] args){

        Class student = new Student().getClass();

        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
         String[] splitMethods;
        for (Method method : methods) {
           splitMethods = method.toString().split(student.getName());
            
            methodList.add(splitMethods[1].replaceAll("(\\(.+\\))|\\.|(\\(\\))", ""));
        }
        
        
        Collections.sort(methodList);       
        for (String name : methodList) {
            System.out.println(name);
        }
        }

    }