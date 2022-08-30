package banch.task.company.VTB_Tasks;

public class Task_4 {

    public String join(String[] args) {
        String result = "";

        for ( String arg : args) {
            result += arg;
            result += ", ";
        }

        return result;
    }

}

/*
Какие минусы у данного метода? Проведите CodeReview этого метода

Answer is lower
 */









/*

4

public StringBuilder join(String[] args) {

   StringBuilder result = new StringBuilder();

   for (String arg : args) {

       result.append(arg).append(", ");

  }

   return result;

}

Доп: спросил, что помимо предложенного можно исправить


 */
