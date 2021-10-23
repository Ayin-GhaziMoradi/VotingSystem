import ir.huri.jcal.JalaliCalendar;


public class Vote {
    private Person person;
    private String date;

    /**
     *
     * @param person an object that stores voted person's full name
     * @param dateString correct format example: "20 10 1390"
     */
    public Vote(Person person, String dateString) { //!!!!!!!!!!!!!!
        this.person = person;
        String[] splited = dateString.split(" ");
        String year = splited[0];
        String month = splited[1];
        String day = splited[2];

        int yearInt = Integer.parseInt(year);
        int monthInt = Integer.parseInt(month);
        int dayInt = Integer.parseInt(day);
        JalaliCalendar jalaliCalendar = new JalaliCalendar(yearInt, monthInt, dayInt);
//        try {
//            DateFormat df = new SimpleDateFormat("dd MM yyyy");
//            Date date = df.parse(dateString);
//            Calendar gregCal = new GregorianCalendar();
//            gregCal.setTime(date);
//            JalaliCalendar jalaliDate = new JalaliCalendar(new GregorianCalendar(date.getYear() , date.getMonth() , date.getDay()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    /**
     *
     * @return voted person first & last name
     */
    public Person getPerson() {
        return person;
    }

    /**
     *
     * @return this voted person's voteing date
     */
    public String getDate() {
        return date;
    }
}
