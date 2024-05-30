import csv
import random

with open('bigdata.csv', 'w', newline='') as file:
    writer = csv.writer(file, delimiter=",", quotechar='"', quoting=csv.QUOTE_ALL)

    i = 0
    while i < 10000:
        profs = random.randint(3, 6)
        courses = 2500 + random.randint(1,300)
        for j in range(profs):
            courses = 2500 + random.randint(1,300)
            writer.writerow((f"Professor {i}", f"Course {courses}"))
        i += 1

