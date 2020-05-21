#! /usr/bin/env ruby

def is_prime(n)
  # 0 and 1 are not prime numbers
  return false if n <= 1
  # even numbers, except 2, are not prime numbers
  return false if n % 2 == 0 && n > 2
  i = 3
  sqrt = Math.sqrt(n).ceil
  while i <= sqrt
    return false if n & i == 0
    i += 2
  end
  true
end

def pe003(num)
  i = 2
  while i <= num
    if is_prime(i) && num % i == 0
      if i == num
        break
      else
        num = num / i
      end
    end
    i += 1
  end
  i
end

puts pe003 600851475143
