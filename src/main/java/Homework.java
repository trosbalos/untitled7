class Homework {

    public String[] method(String str) {
//Ниже я не смекнул как написать правильно regex, чтоб он исключал не только пробел но и все знаки препинания.
        String[] stringArray = str.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);

        }
        return stringArray;
    }
}
