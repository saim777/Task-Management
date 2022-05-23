# Task-Management

##Controller
    - TaskController
    - NotesController
    - UserController

##Service
    - TaskService
    - NotesService
    - UserService
##Repository
    - TaskRepository
    - NotesRepository
    - UserRepository

##Model

   ###Task
```json

    {
      "id": 12,
      "taskTitle": "task-name",
      "dueDate": "30/05/2022",
      "isCompleted": "true/false",
      "userId": 1001
    }
```
###Notes

 ```json
   {
   "id": 10,
  "notesTitle": "task-name",
  "dueDate": "25/05/2022",
  "isCompleted": "true/false",
  "taskId":12
}
```
###User
```json
     {
    "id": 1001,
    "userName": "Saim Baig",
    "email": "saim@gmail.com",
    "password": "password@123"
}
```
##EndPoints
 ###Create Task:
   
     /task/create
 ###fetchAllTask
    /task/fetchAllTask

###fetchTaskById
    /task/fetchTask/{taskId}
```json
     {
       "id": 12,
      "taskTitle": "task-name",
      "dueDate": "30/05/2022",
      "isCompleted": "true/false",
      "userId": 1001,
       "numberOfNotes":5
      }
```
   
###CreateNotes:
    /notes/create/{taskId}
###FetchNotesById
    /notes/fetchNotes/{taskId}