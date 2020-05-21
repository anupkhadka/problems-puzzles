#! /usr/bin/env ruby

def pe001
  sum = 3 + 5
  6.upto(999) do |x|
    if x % 3 == 0 || x % 5 == 0
      sum += x
    end
  end
  sum
end

puts pe001
