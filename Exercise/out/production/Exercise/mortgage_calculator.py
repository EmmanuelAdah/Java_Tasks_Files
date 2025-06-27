print('Enter principal amount: ') principalamount = input()

print('Enter annual percentage rate: ') annualpercentagerate = input()

print('Enter duration in years: ') duration = input()

actualrate = (float)(annualpercentagerate * 0.01)
annualinterestrate = (actualrate * (1 + actualrate)**duration)

actualrateandyears = (((1 + actualrate)**duration) - 1)

mortgage = principalamount * (annualinterestrate / actualrateandyears)

print(mortgage)


