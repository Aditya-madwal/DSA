luggages = 400
traveller = 1800
driver = 100

persons = [100, 200, 300, 100, 289, 231, 233, 122, 12, 123]

print(len(persons))
sum = 0
for p in persons:
    sum = sum + p
    pass

print(sum)

print(f"the total weight is {sum+luggages+traveller+driver}")
print(f"weight needed to be removed = {sum+luggages+traveller+driver-3000}")

# reversed(persons)
persons = sorted(persons)

rev_persons = []

for i in persons:
    rev_persons.insert(0, i)

print(rev_persons)

current_sum = 0
people_removed = 0

for i in range(len(rev_persons)):
    if current_sum < (sum+luggages+traveller+driver-3000):
        current_sum += rev_persons[i]
        people_removed += 1
        pass

print(f"{people_removed} people need to be removed")
