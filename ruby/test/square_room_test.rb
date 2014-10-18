require 'test_helper'
class SquareRoomTest < Test::Unit::TestCase
  def test_area
    square_room = SquareRoom.new(10, 10)
    assert_equal 100,  square_room.area
  end
end
