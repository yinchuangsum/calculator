#Simple Calculator App

## Starting the application
### building the application
```
cd calculator
mvn clean install
```
### run the application
```
cd target
java -jar calculator-0.0.1-SNAPSHOT.jar
```

## API
### Addition
```
API: GET /api/addition?input={number}
Sample response:
{
    "operation": "ADDITION",
    "memory": 0.0,
    "input": -100.0,
    "result": -100.0
}
```

### Subtraction
```
API: GET /api/subtraction?input={number}
Sample response:
{
    "operation": "SUBTRACTION",
    "memory": -100.0,
    "input": -100.0,
    "result": 0.0
}
```
### Multiplication
```
API: GET /api/multiplication?input={number}
Sample response:
{
    "operation": "MULTIPLICATION",
    "memory": 0.0,
    "input": 100.0,
    "result": 0.0
}
```
### Division
```
API: GET /api/division?input={number}
Sample response:
{
    "operation": "DIVISION",
    "memory": 0.0,
    "input": 100.0,
    "result": 0.0
}
```
### Get Memory Value
```
API: GET /api/memoryValue
{
    "operation": "NULL",
    "memory": 0.0,
    "input": null,
    "result": 0.0
}
```