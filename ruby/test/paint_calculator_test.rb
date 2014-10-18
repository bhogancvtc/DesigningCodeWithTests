require 'test_helper'
class PaintCalculatorTest < Test::Unit::TestCase

  def test_calculate_square_room
    paint_calculator = PaintCalculator.new(SquareRoom.new(10.0,10.0))
    assert_equal(1, paint_calculator.gallons_of_paint_for_ceiling)
  end

  def test_calculate_large_square_room
    paint_calculator = PaintCalculator.new(SquareRoom.new(50.0,50.0))
    assert_equal(8, paint_calculator.gallons_of_paint_for_ceiling)
  end

  def test_calculate_circular_room
    paint_calculator = PaintCalculator.new(CircularRoom.new(10.0))
    assert_equal(1, paint_calculator.gallons_of_paint_for_ceiling)
  end
end
