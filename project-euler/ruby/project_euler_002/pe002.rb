#! /usr/bin/env ruby

def fib n
  n <= 1 ? n : fib(n - 1) + fib(n-2)
end

def pe002
  n = 2
  sum = 0
  fibonacci = fib(n)
  while fibonacci < 4000000
    sum += fibonacci if fibonacci % 2 == 0
    n += 1
    fibonacci = fib(n)
  end
  sum
end

puts pe002
