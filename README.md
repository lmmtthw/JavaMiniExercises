# JavaMiniExercises
Generated mini exercises that assumes zero Java and focuses on hands on building small testable steps

## Day 1 — Java basics (so you can read what you write)

### Mini exercise (60–90 min)
In Android Studio, create an empty project.
Make a simple Item Java class with fields: name, quantity, price.

### Add:
- constructor
- getters/setters
- a toString() method

### In an Activity, create an Item object and Log.d() it.

## Docs

- Java basics (language tour): https://docs.oracle.com/javase/tutorial/java/nutsandbolts/
- Classes & objects: https://docs.oracle.com/javase/tutorial/java/javaOO/
- Methods: https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
- Logging (Logcat): https://developer.android.com/studio/debug/am-logcat

## Day 2 — Java collections + “CRUD in memory” (no database yet)

### Mini exercise

- Create a List<Item> in code.
- Implement these 4 methods in a plain Java class ItemStore:
- addItem(Item item) (Create)
- getAllItems() (Read)
- updateItem(int id, Item newItem) or update by name (Update)
- deleteItem(int id) or delete by name (Delete)
- Log the list after each action.

## Docs

- Java collections overview: https://docs.oracle.com/javase/tutorial/collections/
- List interface basics: https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html
