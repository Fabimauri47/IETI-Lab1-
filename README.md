# IETI-Lab1-

Part 2: Implementing the Tasks Microservice RESTFUL API
Create a new project using the Spring Initializr
Use either Java or Kotlin as programming language.
Use Gradle as project option(if your computer is slow then use Maven)
Add Spring Web dependency before generating the project.
Create a new repository on Github and commit the files generated in 1.
Create a new package called dto and inside define your TaskDto object with at least the following fields:
name.
description.
status [TODO, DOING, REVIEW and DONE].
assignedTo.
dueDate.
created.
Create a new package called data and inside define your Task data object with at least the following fields:
id.
name.
description.
status [TODO, DOING, REVIEW and DONE].
assignedTo.
dueDate.
created.
Create a new package called service an inside create the following interface:
Java:

    public interface TaskService
    {
        Task create( Task task );

        Task findById( String id );
        
        List<Task> all();

        void deleteById( String id );

        Task update( Task task, String id );
    }
Kotlin:

    interface TaskService {

       fun create( task: Task): Task

       fun findById( String id ): Task?
       
       fun  all(): List<Task>

       fun deleteById( String id )

       fun update( Task task, String id ): Task

    }
Create an implementation of the TaskService using a HashMap data structure inside.
Make your service implementation TaskServiceHashMap injectable using the @Service annotation.
Implement you TaskController (try to avoid copy paste, use the User Microservice as reference but try doing it consciously).
Test ALL the endpoints of your API using PostMan or any other tool of your preference.
