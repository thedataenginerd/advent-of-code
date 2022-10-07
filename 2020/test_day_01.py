from day_01 import part_one, part_two


def test_part_one():
    input = [1721, 979, 366, 299, 675, 1456]
    output = part_one(input)
    expected = 514579
    assert output == expected


def test_part_two():
    input = [1721, 979, 366, 299, 675, 1456]
    output = part_two(input)
    expected = 241861950
    assert output == expected
