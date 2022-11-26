from datetime import date

# make function to calculate age
def AgeCalculate(gender , birth_date , birth_month , birth_year):
    today = date.today()
    current_date = today.day
    current_month = today.month
    current_year = today.year

    months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    if birth_date > current_date:
        current_date = current_date + months[birth_month-1]
        current_month = current_month - 1
    if birth_month > current_month:
        current_year = current_year - 1
        current_month = current_month + 12

    calculated_date = current_date - birth_date        
    calculated_month = current_month - birth_month        
    calculated_year = current_year - birth_year 

    print(f"Your Age   Year : {calculated_year}  Month : {calculated_month}  Day : {calculated_date}\n")       

    # for fun
    if ((gender == "m") and (18 < calculated_year < 28)):
        print("You are se*y boy :)")
    if ((gender == "f") and (18 < calculated_year < 28)):
        print("You are se*y girl :)")    

        

print("\n\tWelcome to age calculator")
gender = input("Enter your gender m for male and f for female    ") 
birth_date = int(input("Enter your birth date    "))
birth_month = int(input("Enter your birth month    "))
birth_year = int(input("Enter your birth year    "))

# calling function 
AgeCalculate(gender , birth_date , birth_month , birth_year)
