class Student extends Person {
    private String course;

    public Student(int id, String name, String course) {
        super(id, name);
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id +
                " Name: " + name +
                " Course: " + course);
    }

    public int getId() {
        return id;
    }
}
