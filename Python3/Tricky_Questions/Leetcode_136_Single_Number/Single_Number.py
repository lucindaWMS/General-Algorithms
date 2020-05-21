# The tricky part of this problem is to set the time complexity as O(n) and don't use extra memory
# Regular solution to limit time complexity is to use extra memory to get more time efficient algorithm, which doesn't satisfy the second requirement of this problem
# Therefore, consider to use bitwise operation
# Optional solutions mentioned using set() and collections.Counter() in Python3
# However, I'm not quite sure if using these two functions will use extra memory or not (from my understanding, these two functions use extra memory)

def single_number(nums):
	res = 0
	for number in nums:
		res = res ^ number
	return res

if __name__ == '__main__':
	nums = [1, 2, 3, 4, 4, 3, 1]
	res = single_number(nums)
	print(res)