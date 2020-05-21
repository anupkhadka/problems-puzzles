#! /usr/bin/env ruby

def pe003
  lcm = 1
  (2..20).each do |n|
    sum = lcm
    while (sum % n != 0 )
      sum += lcm
    end
    lcm = sum
  end
  lcm
end

puts pe003
