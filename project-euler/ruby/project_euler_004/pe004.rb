#! /usr/bin/env ruby

def pe004(num)
  limit = 10 ** num
  largest_palindrome = 0
  (limit-1).downto(1).each do |n1|
    (limit-1).downto(1).each do |n2|
      product = n1 * n2
      if product.to_s == product.to_s.reverse
        if product > largest_palindrome
          largest_palindrome = product
        end
      end
    end
  end
  largest_palindrome
end

puts pe004(2)
puts pe004(3)
