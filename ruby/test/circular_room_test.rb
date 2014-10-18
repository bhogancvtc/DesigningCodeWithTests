require 'test_helper'
class CircularRoomTest < Test::Unit::TestCase
  def test_area
    circular_room = CircularRoom.new(10.0)
    assert_equal 314.159, circular_room.area
  end
end
