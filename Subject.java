// TODO Задача 3: Школа
//Смоделируйте школьную систему управления учебными предметами с использованием абстрактного
// класса Subject.
//1.	Создайте абстрактный класс Subject с методами для получения информации о предмете
// (например, getSubjectName(), getTeacher()) и абстрактным методом study(),
// который будет реализован в подклассах.
//2.	Реализуйте подклассы, такие как Math, History, Science,
// которые наследуются от Subject и предоставляют свои собственные реализации метода study()
// для каждого учебного предмета.
//3.	Создайте объекты различных учебных предметов и вызовите метод study() для каждого из них.


abstract class Subject {
    private String subjectName;
    private String teacherName;

    public Subject(String subjectName, String teacherName) {
        this.subjectName = subjectName;
        this.teacherName = teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    // Абстрактный метод study
    public abstract void study();
}

// Подкласс Math
class Math extends Subject {
    public Math(String teacherName) {
        super("Математика", teacherName);
    }

    @Override
    public void study() {
        System.out.println("Учитель математики: " + getTeacherName());
    }
}

// Подкласс History
class History extends Subject {
    public History(String teacherName) {
        super("История", teacherName);
    }

    @Override
    public void study() {
        System.out.println("Учитель истории: " + getTeacherName());
    }
}

// Подкласс Science
class Science extends Subject {
    public Science(String teacherName) {
        super("Наука", teacherName);
    }

    @Override
    public void study() {
        System.out.println("Учитель науки: " + getTeacherName());
    }
}







