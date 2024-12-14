package problems;
import java.util.*;
public class Packages {
    static ArrayList<Response> ProcessRequests(ArrayList<Request> requests, Buffer buffer) {
        ArrayList<Response> responses = new ArrayList<>();
        for (Request request : requests) responses.add(buffer.Process(request));
        return responses;
    }

    static void PrintResponses(ArrayList<Response> responses) {
        for (Response response : responses) {
            if (response.dropped) System.out.println(-1);
            else System.out.println(response.start_time);
        }
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        Buffer buffer = new Buffer(sc.nextInt());
        int requests_count = sc.nextInt();
        ArrayList<Request> requests = new ArrayList<>();
        for (int i = 0; i < requests_count; i++) {
            requests.add(new Request(sc.nextInt(), sc.nextInt()));
        }
        PrintResponses(ProcessRequests(requests, buffer));
    }

    static class Request {
        final int arrivalTime, processTime;
        public Request(int arrivalTime, int processTime) {
            this.arrivalTime = arrivalTime;
            this.processTime = processTime;
        }
    }

    static class Buffer {
        final int size;
        final List<Integer> finishTime;
        public Buffer(int size) {
            this.size = size;
            this.finishTime = new ArrayList<>();
        }

        public int lastElement() {
            return finishTime.get(finishTime.size() - 1);
        }

        public Response Process(Request request) {
            while (!finishTime.isEmpty()) {
                if (finishTime.get(0) <= request.arrivalTime) finishTime.remove(0);
                else break;
            }

            if (finishTime.size() == size) return new Response(true, -1);

            if (finishTime.isEmpty()) {
                finishTime.add(request.arrivalTime + request.processTime);
                return new Response(false, request.arrivalTime);
            }

            Response response = new Response(false, lastElement());
            finishTime.add(lastElement() + request.processTime);
            return response;
        }
    }


    static class Response {
        boolean dropped;
        int start_time;
        public Response(boolean dropped, int start_time) {
            this.dropped = dropped;
            this.start_time = start_time;
        }
    }
}