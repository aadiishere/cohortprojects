print("Welcome to the Grade Calculator!")
num_subjects = int(input("How many subjects do you have? "))
subjects = {}
for i in range(num_subjects):
    subject_name = input(f"\nEnter the name of subject {i + 1}: ")
    marks = float(input(f"Enter marks for {subject_name} (out of 100): "))
    subjects[subject_name] = marks
total_marks = 0
subject_count = 0
for name in subjects:
    total_marks += subjects[name]
    subject_count += 1
average_marks = total_marks / subject_count
if average_marks >= 90:
    grade = "A+"
elif average_marks >= 80:
    grade = "A"
elif average_marks >= 70:
    grade = "B"
elif average_marks >= 60:
    grade = "C"
elif average_marks >= 50:
    grade = "D"
else:
    grade = "F"

print("\n----- Grade Report -----")
for name in subjects:
    print(f"{name}: {subjects[name]} marks")

print(f"Total Marks: {total_marks}")
print(f"Average Marks: {average_marks:.2f}")
print(f"Final Grade: {grade}")
