"""Day 1: Report Repair"""


def part_one(expenses: list[int]) -> int:
    for i in range(0, len(expenses) - 1):
        for j in range(i + 1, len(expenses)):
            if expenses[i] + expenses[j] == 2020:
                return expenses[i] * expenses[j]


def part_two(expenses: list[int]) -> int:
    for i in range(0, len(expenses)):
        for j in range(i + 1, len(expenses) - 2):
            for k in range(j + 1, len(expenses) - 1):
                if expenses[i] + expenses[j] + expenses[k] == 2020:
                    return expenses[i] * expenses[j] * expenses[k]


if __name__ == "__main__":
    with open("input/day_01") as expense_report:
        expenses = [int(expense.strip()) for expense in expense_report.readlines()]

    print(f"Part one: {part_one(expenses)}")
    print(f"Part two: {part_two(expenses)}")
